/**
 * Copyright Dingxuan. All Rights Reserved.
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
package org.bcia.javachain.common.ledger.blkstorage.fsblkstorage;

import org.bcia.javachain.common.exception.LedgerException;
import org.bcia.javachain.protos.node.TransactionPackage;

/**
 * 类描述
 *
 * @author wanliangbing
 * @date 2018/3/8
 * @company Dingxuan
 */
public interface Index {

    Long getLastBlockIndexed() throws LedgerException;

    void indexBlock(BlockIdxInfo blockIdxInfo) throws LedgerException;

    FileLocPointer getBlockLocByHash(byte[] blockHash) throws LedgerException;

    FileLocPointer getBlockLocByBlockNum(Long blockNum) throws LedgerException;

    FileLocPointer getTxLoc(String txID) throws LedgerException;

    FileLocPointer getTXLocByBlockNumTranNum(Long blockNum, Long tranNum) throws LedgerException;

    FileLocPointer getBlockLocByTxID(String txID) throws LedgerException;

    TransactionPackage.TxValidationCode getTxValidationCodeByTxID(String txID) throws LedgerException;

}