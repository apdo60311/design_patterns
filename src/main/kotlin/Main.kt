import behavioral_patterns.command_pattern.editor_example.Document
import behavioral_patterns.command_pattern.editor_example.InsertTextCommand
import behavioral_patterns.command_pattern.editor_example.TextEditor
import behavioral_patterns.memento_pattern.shapes_example.DrawingTracker
//import behavioral_patterns.memento_pattern.shapes_example.Shape
import behavioral_patterns.observer_pattern.youtube_example.YoutubeChannel
import behavioral_patterns.observer_pattern.youtube_example.YoutubeUser
import behavioral_patterns.visitor_pattern.exporter_example.*
import behavioral_patterns.visitor_pattern.tax_example.*
import structural_patterns.facade_pattern.stock_handler.items.Monitor
import structural_patterns.composite_pattern.Order
import structural_patterns.composite_pattern.components.Container
import structural_patterns.composite_pattern.components.Laptop
import structural_patterns.composite_pattern.components.SmartPhone
import structural_patterns.facade_pattern.PurchaseHandler
import structural_patterns.facade_pattern.payments.UserPaymentAccount
import structural_patterns.facade_pattern.stock_handler.items.Pc
import structural_patterns.proxy_pattern.sms_example.Message
import structural_patterns.proxy_pattern.sms_example.SmsProxy

fun main(args: Array<String>) {

// composite pattern
//    val order: Order = Order();
//
//    order.addItem(
//        Container()
//            .addComponent(Laptop("lenovo ideapad gameing3" , 2.2).setPrice(33.000))
//            .addComponent(Laptop("Asus TUF Gaming" , 2.1).setPrice(63.000))
//            .addComponent(SmartPhone("Samsung A70" , 0.5).setPrice(8.000))
//    ).addItem(SmartPhone("Mi note 10", 0.4).setPrice(15.000))
//        .addItem(
//            Container()
//                .addComponent(Laptop("Lenovo legion 5" , 2.1).setPrice(73.000))
//                .addComponent(SmartPhone("Huawei nova 7", 0.53).setPrice(18.000))
//        )
//
//    val orderPrice = order.getTotalPrice()
//    println(orderPrice)

//    var regularRemote : RegularRemote = RegularRemote(device = Tv())
//    var advancedRemote : AdvancedRemote = AdvancedRemote(device = Tv())


//    var smsProxy: SmsProxy = SmsProxy().also {
//
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//        it.sendMessage(Message("apdo" , "hisham","2023-12-5"))
//
//    }
//    val userPaymentAccount : UserPaymentAccount = UserPaymentAccount(1000000.3)
//    val purchaseHandler : PurchaseHandler = PurchaseHandler(userPaymentAccount)
//
//    purchaseHandler.addToOrder(Pc(10000.2 , "Lenovo")).addToOrder(Monitor(1000.0 , "Samsung"))
//
//    purchaseHandler.purchase()

//    val youtubeChannel : YoutubeChannel = YoutubeChannel("Channel1")
//
//    val youtubeUser1 : YoutubeUser = YoutubeUser("user1")
//    val youtubeUser2 : YoutubeUser = YoutubeUser("user2")
//    val youtubeUser3 : YoutubeUser = YoutubeUser("user3")
//    val youtubeUser4 : YoutubeUser = YoutubeUser("user4")
//
//    youtubeChannel.attach(youtubeUser1);
//    youtubeChannel.attach(youtubeUser2);
//    youtubeChannel.attach(youtubeUser3);
//
//
//    youtubeChannel.notifyObservers()


//    val document : Document = Document()
//    val textEditor : TextEditor = TextEditor(document = document)
//
//    textEditor.executeCommand(InsertTextCommand("learn",document,0))
//    textEditor.executeCommand(InsertTextCommand("Design",document,document.getText().length))
//    textEditor.executeCommand(InsertTextCommand("Patterns",document,document.getText().length))
//    textEditor.executeCommand(InsertTextCommand("|",document,2))
//
//    textEditor.displayContent()
//
//    textEditor.undo()
//    textEditor.displayContent()


//    val shape1 : Shape = Shape("21",2,2,"Square")
//    val shape2 : Shape = Shape("22",-322,32,"Circle")
//    val shape3 : Shape = Shape("23",212,-12,"Rectangle")
//    val shape4 : Shape = Shape("24",14,20,"Triangle")
//
//    val drawTracker : DrawingTracker = DrawingTracker()
//    drawTracker.addMemento(shape1.save())
//    drawTracker.addMemento(shape2.save())
//
//    drawTracker.showHistory()
//
//    drawTracker.undo()
//
//    println("______________________________")
//    drawTracker.showHistory()
//
//    val shapes : List<Shape> = listOf(Circle(),Rectangle() , Dot() , CompoundShape())
//
//    val xmlExportVisitor: XmlExportVisitor = XmlExportVisitor()
//
//    xmlExportVisitor.visitAll(shapes)


//    val elements : List<Element> = listOf(Company() , House() , GroceryShop())
//
//    val taxCollectorA : TaxCollector = ConcreteTaxCollectorA()
//    val taxCollectorB : TaxCollector = ConcreteTaxCollectorB()
//
//    val taxHolder : TaxHolder = GovernmentTaxHolder(elements)
//
//    taxHolder.accept(taxCollectorA)

}