package atargs3



import grails.test.mixin.*
import spock.lang.*

@TestFor(ReceptionController)
@Mock(Reception)
class ReceptionControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.receptionInstanceList
            model.receptionInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.receptionInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def reception = new Reception()
            reception.validate()
            controller.save(reception)

        then:"The create view is rendered again with the correct model"
            model.receptionInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            reception = new Reception(params)

            controller.save(reception)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/reception/show/1'
            controller.flash.message != null
            Reception.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def reception = new Reception(params)
            controller.show(reception)

        then:"A model is populated containing the domain instance"
            model.receptionInstance == reception
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def reception = new Reception(params)
            controller.edit(reception)

        then:"A model is populated containing the domain instance"
            model.receptionInstance == reception
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/reception/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def reception = new Reception()
            reception.validate()
            controller.update(reception)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.receptionInstance == reception

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            reception = new Reception(params).save(flush: true)
            controller.update(reception)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/reception/show/$reception.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/reception/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def reception = new Reception(params).save(flush: true)

        then:"It exists"
            Reception.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(reception)

        then:"The instance is deleted"
            Reception.count() == 0
            response.redirectedUrl == '/reception/index'
            flash.message != null
    }
}
