package com.example.alexey.wru;

import org.json.JSONObject;

/**
 * Created by alexey on 12.12.16.
 */

public class MessageData {
    String message ;
    String method;

    public MessageData(String message, String method) {
        this.message = message;
        this.method = method;
    }

    public JSONObject getJson() {
        JSONObject toServerMessage = null;
        return toServerMessage;
    }
}
