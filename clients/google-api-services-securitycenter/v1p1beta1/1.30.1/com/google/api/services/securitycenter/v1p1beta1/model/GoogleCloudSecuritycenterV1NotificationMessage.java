/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.securitycenter.v1p1beta1.model;

/**
 * Cloud SCC's Notification
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV1NotificationMessage extends com.google.api.client.json.GenericJson {

  /**
   * If it's a Finding based notification config, this field will be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Finding finding;

  /**
   * Name of the notification config that generated current notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notificationConfigName;

  /**
   * If it's a Finding based notification config, this field will be populated.
   * @return value or {@code null} for none
   */
  public Finding getFinding() {
    return finding;
  }

  /**
   * If it's a Finding based notification config, this field will be populated.
   * @param finding finding or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1NotificationMessage setFinding(Finding finding) {
    this.finding = finding;
    return this;
  }

  /**
   * Name of the notification config that generated current notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationConfigName() {
    return notificationConfigName;
  }

  /**
   * Name of the notification config that generated current notification.
   * @param notificationConfigName notificationConfigName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1NotificationMessage setNotificationConfigName(java.lang.String notificationConfigName) {
    this.notificationConfigName = notificationConfigName;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1NotificationMessage set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1NotificationMessage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1NotificationMessage clone() {
    return (GoogleCloudSecuritycenterV1NotificationMessage) super.clone();
  }

}
