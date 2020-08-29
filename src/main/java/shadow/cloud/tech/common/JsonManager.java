package shadow.cloud.tech.common;

import com.google.gson.Gson;

public class JsonManager {

    private static Gson gson = new Gson();

    public static <T> T deserializable(String str, Class<T> clazz){
        return gson.fromJson(str, clazz);
    }

    public static <T> String serializable(T obj){
        return gson.toJson(obj);
    }

}
