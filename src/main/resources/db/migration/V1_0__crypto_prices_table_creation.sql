CREATE TABLE crypto_prices (
    timestamp   TIMESTAMPTZ       NOT NULL,
    symbol      TEXT              NOT NULL,
    price       DOUBLE PRECISION  NOT NULL,
    PRIMARY KEY (timestamp, symbol)
)
WITH (
    timescaledb.hypertable,
    timescaledb.partition_column='timestamp',
    timescaledb.segmentby='symbol'
);