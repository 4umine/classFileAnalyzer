package com.somelogs.constantpool.info;

import com.somelogs.constantpool.ConstantPoolInfo;
import lombok.Getter;
import lombok.Setter;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Constant_MethodType_info
 *
 * @author LBG - 2018/1/15 0015
 */
@Getter
@Setter
public class ConstantMethodTypeInfo extends ConstantPoolInfo {

    /**
     * descriptor index
     */
    private short descriptorIndex;

    @Override
    public void read(DataInputStream inputStream) throws IOException {
        descriptorIndex = inputStream.readShort();
    }
}
