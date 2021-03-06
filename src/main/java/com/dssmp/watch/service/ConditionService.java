package com.dssmp.watch.service;

import com.dssmp.watch.model.MetricCondition;

import java.util.List;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public interface ConditionService {

    /**
     * 获取指标条件
     *
     * @return
     */
    public List<MetricCondition> getMetricCondition();


    /**
     * 根据ID查询MetricCondition
     *
     * @param id
     * @return
     */
    public MetricCondition getMetricConditionById(long id);

    /**
     * 保存指标条件
     *
     * @param metricCondition
     */
    public void saveMetricCondition(MetricCondition metricCondition);


    /**
     * 根据ID删除条件
     *
     * @param id
     */
    public void deleteMetricCondition(long id);
}
