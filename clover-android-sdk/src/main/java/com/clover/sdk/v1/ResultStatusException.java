/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.clover.sdk.v1;

import android.text.TextUtils;

/**
 * An exception that wraps a {@link com.clover.sdk.v1.ResultStatus}. Subclasses of this
 * class are thrown from service connector methods, wrapping the "out" parameter
 * {@link com.clover.sdk.v1.ResultStatus} in an exception.
 */
public class ResultStatusException extends Exception {
  private ResultStatus resultStatus;

  public ResultStatusException(ResultStatus resultStatus) {
    super("status code: " + resultStatus.getStatusCode() + (!TextUtils.isEmpty(resultStatus.getStatusMessage()) ? " " + resultStatus.getStatusMessage() : ""));
    this.resultStatus = resultStatus;
  }

  /**
   * Gets the result status.
   */
  public ResultStatus getResultStatus() {
    return resultStatus;
  }
}
