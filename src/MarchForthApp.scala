import org.http4s.{HttpService, Response, Status}
import fs2.{Stream, Task}
import org.http4s.dsl._
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.util.StreamApp

/**
  * Created by dharshekthvel on 5/1/18.
  */
object MarchForthApp extends StreamApp {


  implicit val strategy = fs2.Strategy.fromFixedDaemonPool(2, threadName = "strategy")

  override def stream(args: List[String]): Stream[Task, Nothing] = {

    val builder = BlazeBuilder.bindHttp(4545, "localhost")
                              .mountService(twitterDataService, "/")


    builder.serve


  }



  def getTweetsForIFRSStandard(): Task[String] = {

    Task("IFRS Tweets")
  }




  val twitterDataService = HttpService {
    case request @ GET -> Root => Ok("Knocked the root service")

    case request @ GET -> Root / "getIFRSTweets" => Ok(getTweetsForIFRSStandard)

    case request @ PUT => NoContent()
    case _ => Ok()



  }



}
