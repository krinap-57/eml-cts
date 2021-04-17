/*
 * Copyright 2019-2020 The Energy Mashup Lab
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

package org.theenergymashuplab.cts.lma;


public class TenderIdType extends UidType	{
	
	public long value() {
		return this.myUidId;
	}
	
	public TenderIdType()	{
	}
	
	@Override
	public String toString()	{
		return String.valueOf(myUidId);
	}

	// NEED SETTERS AND GETTERS FOR JSON SERIALIZATION?
	
}