package com.fpivetti.microservices.core.product;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;

public abstract class MongoDbTestBase {

    @ServiceConnection
    private static final MongoDBContainer database = new MongoDBContainer("mongo:6.0.4");

    static {
        database.start();
    }
}