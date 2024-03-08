package com.sports.exception;

import com.sports.common.ResponseCode;


public class RecipeStrengthGroupException extends CustomException {
    public RecipeStrengthGroupException(ResponseCode responseCode) {
        super(responseCode);
    }

    public RecipeStrengthGroupException(ResponseCode responseCode, Object... args) {
        super(responseCode, args);
    }
}
