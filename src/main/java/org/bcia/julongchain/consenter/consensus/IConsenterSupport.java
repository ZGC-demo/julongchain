/**
 * Copyright DingXuan. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bcia.julongchain.consenter.consensus;

import com.google.protobuf.InvalidProtocolBufferException;
import org.bcia.julongchain.common.exception.ConsenterException;
import org.bcia.julongchain.common.exception.LedgerException;
import org.bcia.julongchain.common.exception.PolicyException;
import org.bcia.julongchain.common.exception.ValidateException;
import org.bcia.julongchain.protos.common.Common;

/**
 * consenter支持类
 *
 * @author zhangmingyang
 * @Date: 2018/3/7
 * @company Dingxuan
 */
public interface IConsenterSupport {

    /**
     * 创建下一个区块结构
     *
     * @param messages
     * @return
     * @throws ConsenterException
     */
    Common.Block createNextBlock(Common.Envelope[] messages) throws ConsenterException;

    /**
     * 写区块
     *
     * @param block
     * @param encodedMetadataValue
     * @throws ConsenterException
     */
    void writeBlock(Common.Block block, byte[] encodedMetadataValue) throws ConsenterException;

    /**
     * 写配置块
     *
     * @param block
     * @param encodedMetadataValue
     * @throws InvalidProtocolBufferException
     * @throws LedgerException
     * @throws ValidateException
     * @throws PolicyException
     */
    void writeConfigBlock(Common.Block block, byte[] encodedMetadataValue) throws ConsenterException;

}
