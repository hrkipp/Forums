package forums.actions

abstract class  ActionHandler[A <: Action, R <: Result[A]] {

  def execute(action : A) : R

}
