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

package org.theenergymashuplab.cts.teua;

import org.theenergymashuplab.cts.teua.controller.payloads.*;
import org.theenergymashuplab.cts.teua.controller.payloads.PositionGetPayload;

import java.util.ArrayList;


public class PositionResponseList {
	private ArrayList<PositionGetPayload> responseList;
	
	PositionResponseList()	{
		responseList = new ArrayList<>();
	}
	
	@Override
	public String  toString()	{
		String outString = new String();
		
		for (int i = 0; i < responseList.size(); i++)	{
			outString = outString + " '" + responseList.get(i);
		}
		
		return outString;
	}
	
	public long getFirstPositionQuantity()	{
		return responseList.get(0).getQuantity();
	}

	public ArrayList<PositionGetPayload> getResponseList() {
		return responseList;
	}

	public void setResponseList(ArrayList<PositionGetPayload> responseList) {
		this.responseList = responseList;
	}
	

}
