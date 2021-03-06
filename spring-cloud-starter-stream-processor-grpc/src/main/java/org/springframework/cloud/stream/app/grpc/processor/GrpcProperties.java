/*
 * Copyright 2018 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *        https://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.springframework.cloud.stream.app.grpc.processor;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author David Turanski
 **/

@ConfigurationProperties(prefix = "grpc")
public class GrpcProperties {

	public enum Stub {async, blocking,streaming,riff}
	/**
	 * The gRPC host name.
	 */
	private String host;
	/**
	 * The gRPC server port.
	 */
	private int port;
	/**
	 * Flag to send messages in plain text. SSL configuration required otherwise.
	 */
	private boolean plainText = true;

	/**
	 * The idle timeout in seconds.
	 */
	private long idleTimeout;

	/**
	 * The maximum message size (bytes).
	 */
	private int maxMessageSize;

	/**
	 * Flag to include headers in Messages to the remote process.
	 */
	private boolean includeHeaders;

	/**
	 * RPC communications style (default 'blocking').
	 */
	private Stub stub = Stub.blocking;

	public int getMaxMessageSize() {
		return maxMessageSize;
	}

	public void setMaxMessageSize(int maxMessageSize) {
		this.maxMessageSize = maxMessageSize;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public boolean isPlainText() {
		return plainText;
	}

	public void setPlainText(boolean plainText) {
		this.plainText = plainText;
	}

	public long getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(long idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public boolean isIncludeHeaders() {
		return includeHeaders;
	}

	public void setIncludeHeaders(boolean includeHeaders) {
		this.includeHeaders = includeHeaders;
	}

	public Stub getStub() {
		return stub;
	}

	public void setStub(Stub stub) {
		this.stub = stub;
	}
}
