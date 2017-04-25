/**
 * Copyright © 2016 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.syslog;

import com.github.jcustenborder.kafka.connect.utils.config.MarkdownFormatter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TCPSyslogConfigTest {

  final static String HOST = "0.0.0.0";
  final static Integer PORT = 5514;
  final static Integer BACKLOG = 1024;
  final static Integer MAXACTIVESOCKETS = 65535;
  final static Byte MAXACTIVESOCKETSBEHAVIOR = 0;
  final static String KAFKA_TOPIC = "syslog";

  TCPSyslogSourceConnectorConfig config;
  Map<String, String> params;


  public static TCPSyslogSourceConnectorConfig config() {
    Map<String, String> params;
    params = new LinkedHashMap<>();
    params.put(BaseSyslogSourceConnectorConfig.PORT_CONFIG, PORT.toString());
    params.put(BaseSyslogSourceConnectorConfig.HOST_CONFIG, HOST);
    params.put(BaseSyslogSourceConnectorConfig.TOPIC_CONFIG, KAFKA_TOPIC);
    params.put(TCPSyslogSourceConnectorConfig.BACKLOG_CONFIG, BACKLOG.toString());
    params.put(TCPSyslogSourceConnectorConfig.MAX_ACTIVE_SOCKETS_BEHAVIOR_CONFIG, MAXACTIVESOCKETSBEHAVIOR.toString());
    params.put(TCPSyslogSourceConnectorConfig.MAX_ACTIVE_SOCKETS_CONFIG, MAXACTIVESOCKETS.toString());
    params.put(TCPSyslogSourceConnectorConfig.REVERSE_DNS_IP_CONF, "true");
    return new TCPSyslogSourceConnectorConfig(params);
  }

  @BeforeEach
  public void setup() {
    this.params = new LinkedHashMap<>();
    this.params.put(BaseSyslogSourceConnectorConfig.PORT_CONFIG, PORT.toString());
    this.params.put(BaseSyslogSourceConnectorConfig.HOST_CONFIG, HOST);
    this.params.put(BaseSyslogSourceConnectorConfig.TOPIC_CONFIG, KAFKA_TOPIC);
    this.params.put(TCPSyslogSourceConnectorConfig.BACKLOG_CONFIG, BACKLOG.toString());
    this.params.put(TCPSyslogSourceConnectorConfig.MAX_ACTIVE_SOCKETS_BEHAVIOR_CONFIG, MAXACTIVESOCKETSBEHAVIOR.toString());
    this.params.put(TCPSyslogSourceConnectorConfig.MAX_ACTIVE_SOCKETS_CONFIG, MAXACTIVESOCKETS.toString());
    this.config = new TCPSyslogSourceConnectorConfig(this.params);
  }
}
