/*
 * Copyright 2021-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jpa.domain.sample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

/**
 * Sample entity using {@link IdClass} annotation to demarcate ids.
 *
 * @author Mark Paluch
 */
@Entity
@IdClass(PersistableWithSingleIdClassPK.class)
public class PersistableWithSingleIdClass {

	private static final long serialVersionUID = 1L;

	@Id private Long first;

	protected PersistableWithSingleIdClass() {

	}

	public PersistableWithSingleIdClass(Long first) {
		this.first = first;
	}

	/**
	 * @return the first
	 */
	public Long getFirst() {
		return first;
	}

}
