package com.lingh.shardingspherev540readwritesplittingtest;

public record TOrder(
        Long orderId,
        String name,
        Long userId) {
}
