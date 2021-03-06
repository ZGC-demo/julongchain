/**
 * Copyright Aisino. All Rights Reserved.
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

package org.bcia.julongchain.common.policycheck.bean;

import org.bcia.julongchain.protos.common.MspPrincipal;

import java.util.List;

/**
 * 类描述
 * 策略解析时期待的上下文所用的实体类
 * @author yuanjun
 * @date 11/05/18
 * @company Aisino
 */
public class Context {
    private int idNum;
    private List<MspPrincipal.MSPPrincipal> principals;

    public Context(int idNum, List<MspPrincipal.MSPPrincipal> principals) {
        this.idNum = idNum;
        this.principals = principals;
    }

    public int getIDNum() {
        return idNum;
    }

    public void setIDNum(int IDNum) {
        this.idNum = IDNum;
    }

    public List<MspPrincipal.MSPPrincipal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<MspPrincipal.MSPPrincipal> principals) {
        this.principals = principals;
    }
}
