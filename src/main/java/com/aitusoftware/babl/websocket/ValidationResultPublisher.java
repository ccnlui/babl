/*
 * Copyright 2019-2020 Aitu Software Limited.
 *
 * https://aitusoftware.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aitusoftware.babl.websocket;

/**
 * Publisher for validation results.
 */
public interface ValidationResultPublisher
{
    /**
     * Publish the result of session validation to the session container.
     *
     * @param validationResult indicates whether validation was successful
     * @return true if the message was successfully published, false otherwise (sender should retry)
     */
    boolean publishResult(ValidationResult validationResult);
}
