package org.example.accounts.serialization;

import com.google.gson.Gson;
import org.example.accounts.classes.BaseBankAccount;
import org.example.utils.Serialization;

public class AccountJSONSerializer<T extends BaseBankAccount> implements Serialization<T> {
    private final Gson gson = new Gson();
    private final Class<T> type;

    public AccountJSONSerializer(Class<T> type) {
        this.type = type;
    }

    @Override
    public String serialize(T account) {
        return gson.toJson(account);
    }

    @Override
    public T deserialize(String data) {
        return gson.fromJson(data, type);
    }
}
