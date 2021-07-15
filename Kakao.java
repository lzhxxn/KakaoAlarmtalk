
      if (cond.get("kakao_use_yn").equals("Y")) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(rule.get("event_nm"));
			buffer.append("["+event.get("field_val")+"]");
			
			alarm.put("sms_msg", buffer.toString());
			
			alarmDAO.insertAlarmEventKAKAO(alarm);
		}
      
