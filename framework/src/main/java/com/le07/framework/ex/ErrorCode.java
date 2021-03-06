package com.le07.framework.ex;



public interface ErrorCode {
    /**
     * 自定义错误起始值
     */
    static final int CUSTOM_ERROR_START = 100;

    /**
     * 请求成功执行
     */
    static final int SUCCEED = 0;

    /**
     * 服务器内部错误
     */
    static final int SERVER_ERROR = 1;

    /**
     * 非法参数
     */
    static final int ILLEGAL_PARAM = 2;

    /**
     * 必须参数不存在
     */
    static final int MISS_PARAM = 3;

    /**
     * 状态错误
     */
    static final int ILLEGAL_STATE = 4;

    /**
     * 不支持此操作
     */
    static final int UN_SUPPORTED = 5;

    /**
     * 没有权限
     */
    static final int NO_PERMISSON = 6;

    /**
     * 对象不存在
     */
    static final int ENTITY_NOT_FOUND = 50;

    /**
     * 对象已存在
     */
    static final int ENTITY_ALREADY_EXIST = 51;
    
    /**
	 * 验证错误
	 */
	static final int VALIDATE_ERROR = 60;
    
    /**
	 * 参数不在指定范围内
	 */
	static final int RANGE_ERROR = 61;

	/**
	 * 不匹配正则表达式
	 */
	static final int PATTERN_NOT_MATCH = 62;
}
