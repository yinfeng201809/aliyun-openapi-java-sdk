/*
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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetPredictiveJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPredictiveJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Job job;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public static class Job {

		private String jobId;

		private String jobGroupId;

		private String scenarioId;

		private String strategyId;

		private Integer priority;

		private Integer systemPriority;

		private String status;

		private String referenceId;

		private String failureReason;

		private List<Contact> contacts;

		private List<Task> tasks;

		private List<String> callingNumbers;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getSystemPriority() {
			return this.systemPriority;
		}

		public void setSystemPriority(Integer systemPriority) {
			this.systemPriority = systemPriority;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}

		public String getFailureReason() {
			return this.failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

		public List<Contact> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}

		public List<Task> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<Task> tasks) {
			this.tasks = tasks;
		}

		public List<String> getCallingNumbers() {
			return this.callingNumbers;
		}

		public void setCallingNumbers(List<String> callingNumbers) {
			this.callingNumbers = callingNumbers;
		}

		public static class Contact {

			private String contactId;

			private String contactName;

			private String honorific;

			private String role;

			private String phoneNumber;

			private String state;

			private String referenceId;

			private String jobId;

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public String getContactName() {
				return this.contactName;
			}

			public void setContactName(String contactName) {
				this.contactName = contactName;
			}

			public String getHonorific() {
				return this.honorific;
			}

			public void setHonorific(String honorific) {
				this.honorific = honorific;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getReferenceId() {
				return this.referenceId;
			}

			public void setReferenceId(String referenceId) {
				this.referenceId = referenceId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}
		}

		public static class Task {

			private String taskId;

			private String jobId;

			private String scenarioId;

			private String chatbotId;

			private Long planedTime;

			private Long actualTime;

			private String callingNumber;

			private String calledNumber;

			private String callId;

			private String status;

			private String brief;

			private Integer duration;

			private Contact1 contact1;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(String scenarioId) {
				this.scenarioId = scenarioId;
			}

			public String getChatbotId() {
				return this.chatbotId;
			}

			public void setChatbotId(String chatbotId) {
				this.chatbotId = chatbotId;
			}

			public Long getPlanedTime() {
				return this.planedTime;
			}

			public void setPlanedTime(Long planedTime) {
				this.planedTime = planedTime;
			}

			public Long getActualTime() {
				return this.actualTime;
			}

			public void setActualTime(Long actualTime) {
				this.actualTime = actualTime;
			}

			public String getCallingNumber() {
				return this.callingNumber;
			}

			public void setCallingNumber(String callingNumber) {
				this.callingNumber = callingNumber;
			}

			public String getCalledNumber() {
				return this.calledNumber;
			}

			public void setCalledNumber(String calledNumber) {
				this.calledNumber = calledNumber;
			}

			public String getCallId() {
				return this.callId;
			}

			public void setCallId(String callId) {
				this.callId = callId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getBrief() {
				return this.brief;
			}

			public void setBrief(String brief) {
				this.brief = brief;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public Contact1 getContact1() {
				return this.contact1;
			}

			public void setContact1(Contact1 contact1) {
				this.contact1 = contact1;
			}

			public static class Contact1 {

				private String contactId;

				private String contactName;

				private String honorific;

				private String role;

				private String phoneNumber;

				private String state;

				private String referenceId;

				private String jobId;

				public String getContactId() {
					return this.contactId;
				}

				public void setContactId(String contactId) {
					this.contactId = contactId;
				}

				public String getContactName() {
					return this.contactName;
				}

				public void setContactName(String contactName) {
					this.contactName = contactName;
				}

				public String getHonorific() {
					return this.honorific;
				}

				public void setHonorific(String honorific) {
					this.honorific = honorific;
				}

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getPhoneNumber() {
					return this.phoneNumber;
				}

				public void setPhoneNumber(String phoneNumber) {
					this.phoneNumber = phoneNumber;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getReferenceId() {
					return this.referenceId;
				}

				public void setReferenceId(String referenceId) {
					this.referenceId = referenceId;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}
			}
		}
	}

	@Override
	public GetPredictiveJobResponse getInstance(UnmarshallerContext context) {
		return	GetPredictiveJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
