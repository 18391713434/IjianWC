package com.sjz.ijianwc.exception;

public class IJianException extends RuntimeException {
        private  String message;
        private  Integer code;

        public IJianException(String message) {
            this.message = message;
        }
        public IJianException(Integer code,String message) {
            this.message = message;
            this.code = code;
        }
        @Override
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

}
