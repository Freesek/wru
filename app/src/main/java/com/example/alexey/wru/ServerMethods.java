package com.example.alexey.wru;

/**
 * Created by alexey on 12.12.16.
 */

public enum ServerMethods {
    IM_HERE,
    TEST_CLOSE,
    START_SOCKET,
    CLOSE_SOCKET,
    SET_INF,
    GET_INF,
    DEL_INF_BY_KEY,
    DEL_INF_ALL,
    WRU,
    WRU_GROUP,
    IM_HERE_GROUP,
    GET_MY_DATA,
    IM,
    NEW_GROUP,
    ADD_USER_TO_GROUP,
    DEL_USER_FROM_GROUP,
    LEAVE_THE_GROUP,
    MY_DATA_UPDATE,
    INDEX;

    public String returnValue() {
            String value = null;
        switch (this) {
            case IM_HERE: return "im_here";
            case TEST_CLOSE: return "text_close";
            case START_SOCKET: return "start_socket";
            case CLOSE_SOCKET: return "close_socket";
            case SET_INF: return "set_inf";
            case GET_INF: return "del_inf";
            case DEL_INF_BY_KEY: return "del_inf_by_key";
            case DEL_INF_ALL: return "del_inf_all";
            case WRU: return "wry";
            case WRU_GROUP: return "wry_group";
            case IM_HERE_GROUP: return "im_here_group";
            case GET_MY_DATA: return "get_my_data";
            case IM: return "im";
            case NEW_GROUP: return "new_group";
            case ADD_USER_TO_GROUP: return "add_user_to_group";
            case DEL_USER_FROM_GROUP: return "del_user_from_group";
            case LEAVE_THE_GROUP: return "leave_the_group";
            case MY_DATA_UPDATE: return "my_data_update";
            case INDEX: return "index";
        }
        return value;
    }
}
