package dev.patika.library.core.result;

import lombok.Getter;

import javax.naming.spi.DirStateFactory;
@Getter
public class ResultData<T> extends Result {
    private T data;

    public ResultData(boolean status, String message, String code, T data) {
        super(status, message, code);
        this.data = data;
    }
}
