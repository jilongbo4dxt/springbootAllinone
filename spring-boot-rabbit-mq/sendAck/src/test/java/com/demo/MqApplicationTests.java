package com.demo;

import com.demo.rabbit.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {

	@Autowired
	private Sender sender;

	/**
	 * 发到队列
	 */
	@Test
	public void hello() {
		sender.send();
	}

	/**
	 * 发到交换机
	 */
	@Test
	public void sendDirectMessage()  {
		sender.sendDirectMessage();
	}

	@Test
	public void sendTopicMessage1()  {
		sender.sendTopicMessage1();
	}

	@Test
	public void sendTopicMessage2()  {
		sender.sendTopicMessage2();
	}
	@Test
	public void sendFanoutMessage()  {
		sender.sendFanoutMessage();
	}
    @Test
    public void TestMessageAck()  {
        sender.testMessageAck();
    }
	@Test
	public void TestMessageAck2()  {
		sender.testMessageAck2();
	}
}
