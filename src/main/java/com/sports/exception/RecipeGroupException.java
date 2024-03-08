package com.sports.exception;

import com.sports.common.ResponseCode;


public class RecipeGroupException  extends CustomException{
    public RecipeGroupException(ResponseCode responseCode) {
        super(responseCode);
    }

    public RecipeGroupException(ResponseCode responseCode, Object... args) {
        super(responseCode, args);
    }
}
