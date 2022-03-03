package com.example.manage.utils;

import com.alibaba.fastjson.JSON;

public class ResultUtils {

    private String msg;
    private boolean success = true;
    private Object result;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ResultUtils() {
    }

    public ResultUtils(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResultUtils(boolean success, String msg, Object result) {
        this.success = success;
        this.msg = msg;
        this.result = result;
    }

    public  boolean isSuccess() {
        return success;
    }

    public static Object successResult() {
        ResultUtils resultUtils = new ResultUtils();
        resultUtils.setSuccess(true);
        resultUtils.setMsg("success");
        resultUtils.setResult(null);
        return JSON.toJSON(resultUtils);
    }

    public static  Object successResult(Object obj) {
        if (obj instanceof String) {
            return successResult(null, (String) obj);
        } else {
            return successResult(obj, "error");
        }
    }

    public static  Object successResult(Object obj, String msg) {
        ResultUtils resultUtils = new ResultUtils();
        resultUtils.setSuccess(true);
        resultUtils.setMsg(msg);
        resultUtils.setResult(obj);
        return JSON.toJSON(resultUtils);
    }

    public static  Object errorResult() {
        ResultUtils resultUtils = new ResultUtils();
        resultUtils.setSuccess(false);
        resultUtils.setMsg("error");
        resultUtils.setResult(null);
        return JSON.toJSON(resultUtils);
    }

    public static  Object errorResult(Object obj) {
        if (obj instanceof String) {
            return renderJsonError(null, (String) obj);
        } else {
            return renderJsonError(obj, "error");
        }
    }

    public static  Object renderJsonError(Object obj, String msg) {
        ResultUtils resultUtils = new ResultUtils();
        resultUtils.setSuccess(false);
        resultUtils.setMsg(msg);
        resultUtils.setResult(obj);
        return JSON.toJSON(resultUtils);
    }

}
