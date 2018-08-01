package com.thomsonreuters.lambda.launcher;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.thomsonreuters.toucan.StateData;

public class LambdaFunctionHandler implements RequestHandler<StateData, StateData> {

    @Override
    public StateData handleRequest(StateData input, Context context) {
        context.getLogger().log("Input: " + input);
        //comment
        return input;
    }

}
