package com.example.a14860.googletest07;

/**
 * 监听器
 *
 * @author gfuil
 */
public interface OnBaseListener {

    void onMessage(String msg);

    void onResult(int code, String msg);

    void onNoData(String type);

    void onShowData(String type);

    void close();

}
