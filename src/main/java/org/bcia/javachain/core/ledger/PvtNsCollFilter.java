/*
 * Copyright Dingxuan. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

		 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.bcia.javachain.core.ledger;

import java.util.HashMap;
import java.util.Map;

/**
 * 类描述
 *
 * @author sunzongyu
 * @date 2018/04/09
 * @company Dingxuan
 */
public class PvtNsCollFilter {
    private Map<String, PvtCollFilter> filters = new HashMap<>();

    public Map<String, PvtCollFilter> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, PvtCollFilter> filters) {
        this.filters = filters;
    }

    /**
     * 添加PvtCollFilter到PvtNsCollFilter
     */
    public void add(String ns, String coll) {
        PvtCollFilter collFilter = filters.get(ns);
        if(collFilter == null){
            filters.put(ns, new PvtCollFilter());
        }
        collFilter.getFileters().put(coll, true);
    }

    /**
     * 判断namespace ns, collection coll是否存在
     */
    public boolean has(String ns, String coll){
        PvtCollFilter collFilter = filters.get(ns);
        if(collFilter == null){
            return false;
        }
        return collFilter.getFileters().get(coll);
    }
}