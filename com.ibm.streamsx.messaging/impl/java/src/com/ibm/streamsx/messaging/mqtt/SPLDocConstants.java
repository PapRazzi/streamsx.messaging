package com.ibm.streamsx.messaging.mqtt;

public class SPLDocConstants {

	// SPL Documentation for MQTTSource
	static final String MQTTSRC_OP_DESCRIPTION = "Java Operator MqttSourceOperator";
	static final String MQTTSRC_OUTPUT_PORT_1 = "Optional output ports";
	static final String MQTTSRC_OUPUT_PORT_0 = "Port that produces tuples.";
	static final String MQTTSRC_INPUT_PORT0 = "Optional input ports";
	static final String MQTTSRC_PARAM_PERIOD_DESC = "Reconnection period in ms, default is 60000 ms.";
	static final String MQTTSRC_PARAM_RECONN_BOUND_DESC = "Reconnection bound, 0 for no retry, n for n number of retries, -1 for inifinite retry.";
	static final String MQTTSRC_PARAM_TOPICATTRNAME_DESC = "Output attribute on output data stream to assign message topic to.";
	static final String MQTTSRC_PARAM_SERVERIURI_DESC = "Server to subscribe messages from.";
	static final String MQTTSRC_PARAM_QOS_DESC = "List of qos for topic subscriptions";
	static final String MQTTSRC_PARAM_TOPICS_DESC = "List of topics to subscribe to.";

	// SPL Documnetation for MQTTSink
	static final String MQTTSINK_OP_DESCRIPTION = "MQTTSink operator publishes messages to MQTT Provider";

	static final String MQTTSINK_PARAM_QOS_ATTR_NAME_DESC = "Attribute name that contains the qos to publish the message with.  This parameter is mutually exclusive with the \\\"qos\\\" parameter.";

	static final String MQTTSINK_PARAM_TOPIC_ATTR_NAME_DESC = "Attribute name that contains the topic to publish the message with.  This parameter is mutually exclusive with the \\\"topic\\\" parameter.";

	static final String MQTTSINK_PARAM_RETAIN_DESC = "Indicates if messages should be retained on the MQTT server.  Default is false.";

	static final String MQTTSINK_PARAM_PERIOD_DESC = "Reconnection period in ms, default is 60000 ms.";

	static final String MQTTSINK_PARAM_RECONN_BOUND_DESC = "Reconnection bound, 0 for no retry, n for n number of retries, -1 for inifinite retry.";

	static final String MQTTSINK_PARAM_SERVERURI_DESC = "Server to publish messages to.";

	static final String MQTTSINK_PARAM_QOS_DESC = "Qos to publish to.";

	static final String MQTTSINK_PARAM_TOPIC_DESC = "Topic to publish to.  This parameter is mutually exclusive with the \\\"topicAttributeName\\\" parameter.";

	public static final String MQTTSINK_OUTPUT_PORT0 = "Optional error output port.";

	public static final String MQTTSINK_INPUTPORT1 = "Optional input ports";

	public static final String MQTTSINK_INPUTPORT0 = "Port that ingests tuples.";

}