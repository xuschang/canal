package com.alibaba.otter.canal.protocol;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

public class FlatMessageCust {
    private static final long         serialVersionUID = -3386650678735860055L;
    private String                    schema_name;
    private String                    table_name;
    private Long                      timestamp;
    private String                    operation;
    private Map<String, String> data;

    public FlatMessageCust() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSchema_name() {
        return schema_name;
    }

    public void setSchema_name(String schema_name) {
        this.schema_name = schema_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FlatMessage [schema_name=" + schema_name + ", table_name=" + table_name + ", timestamp=" + timestamp + ", operation=" + operation + ", data=" + data  + "]";
    }
}
