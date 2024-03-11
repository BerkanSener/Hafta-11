package dev.patika.library.core.utilies;

import dev.patika.library.core.result.ResultData;

public class ResultHelper {
    public static <T>ResultData<T> created(T data){
        return new ResultData<>(true, Msg.CREATED, "201", data);
    }
    public static <T> ResultData<T> validateError(T data){
        return new ResultData<>(false, Msg.VALIDATE_ERROR,"400", data);

    }
 }
