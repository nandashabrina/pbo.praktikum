public class MessageProcessorTest {
    MessageProcessor mProcessor;

    public MessageProcessorTest(){
        mProcessor  = new MessageProcessor();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("What's up Bro?");
    }

    @Test
    public void testShowMessage(){
        String expectedResult = ("Hai Rafael, you have message from Ronaldo." + " \nThe message as follows: What's up Bro?");
        Assert.assertEquals(expectedResult, mProcessor.messageFormat());
    }
}
