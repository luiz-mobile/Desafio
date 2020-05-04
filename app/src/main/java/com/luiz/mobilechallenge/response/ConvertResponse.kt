package com.luiz.mobilechallenge.model.response

data class ConvertResponse (var success:Boolean? = false,
                            var quotes: Map<String, Double>? = null,
                            var error:ErrorResponse? = null)