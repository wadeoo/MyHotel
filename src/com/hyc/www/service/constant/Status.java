/*
 * Copyright (c) 2019.  黄钰朝
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hyc.www.service.constant;


import com.hyc.www.vo.PagesVo;

/**
 * 用于描述服务的状态
 * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
 * @program XHotel
 * @description
 * @date 2019-04-19 17:32
 */
public enum Status {
    /*
     **************************************************************
     *              注册状态
     **************************************************************
     */

    /**
     * 重复注册
     */
    ACCOUNT_ALREADY_EXIST,
    /**
     * 数据不合法
     */
    DATA_ILLEGAL,
    /**
     * 输入次数过多
     */
    DATA_TOO_MUCH,


    /*
     **************************************************************
     *              登陆状态
     **************************************************************
     */

    /**
     * 密码错误
     */
    PASSWORD_INCORRECT,
    /*
     **************************************************************
     *              修改信息状态
     **************************************************************
     */
    PERMISSION_DENY,

    /*
     **************************************************************
     *              管理房间状态
     **************************************************************
     */
    /**
     * 房间已经存在
     */
    ROOM_ALREADY_EXIST,

    /*
     **************************************************************
     *              订单状态
     **************************************************************
     */
    /**
     * 已被预定
     */
    ALREADY_BOOKED,

    /*
     **************************************************************
     *              操作状态
     **************************************************************
     */
    /**
     * 不存在
     */
    NOT_FOUNT,
    /**
     * 没有查询结果
     */
    NO_RESULT,
    /**
     * 服务成功
     */
    SUCCESS,
    /**
     * 服务错误
     */
    ERROR;
}