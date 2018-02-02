package com.somelogs.constantpool.info;

import com.somelogs.constantpool.ConstantPoolInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Constant_String_Info
 *
 * @author LBG - 2018/1/15 0015 17:30
 */
@Setter
@Getter
@ToString
public class ConstantStringInfo extends ConstantPoolInfo {

    private short index;

    @Override
    public void read(DataInputStream inputStream) throws IOException {
        index = inputStream.readShort();
    }
}
