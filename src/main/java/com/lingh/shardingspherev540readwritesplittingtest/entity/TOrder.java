package com.lingh.shardingspherev540readwritesplittingtest.entity;

public record TOrder(
        Long orderId,
        String name,
        Long userId) {
}
