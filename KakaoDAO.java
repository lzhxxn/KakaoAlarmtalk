	public void insertAlarmEventKAKAO(Map<String, Object> m) {
		SqlSession session = factory.openSession();
		try {
			session.insert("AlarmMapper.insertAlarmEventKAKAO", m);
			session.commit();
		} finally {
			session.close();
		}
	}
