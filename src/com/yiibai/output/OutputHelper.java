package com.yiibai.output;

public class OutputHelper {
    public IOutputGenerator getOutputGenerator() {
        return outputGenerator;
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    IOutputGenerator outputGenerator;


}
