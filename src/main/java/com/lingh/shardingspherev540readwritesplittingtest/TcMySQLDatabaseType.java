package com.lingh.shardingspherev540readwritesplittingtest;

import org.apache.shardingsphere.infra.database.core.type.DatabaseType;
import org.apache.shardingsphere.infra.spi.type.typed.TypedSPILoader;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public final class TcMySQLDatabaseType implements DatabaseType {

    @Override
    public Collection<String> getJdbcUrlPrefixes() {
        return Collections.singleton("jdbc:tc:mysql:");
    }

    @Override
    public Optional<DatabaseType> getTrunkDatabaseType() {
        return Optional.of(TypedSPILoader.getService(DatabaseType.class, "MySQL"));
    }

    @Override
    public String getType() {
        return "TC-MySQL";
    }
}
