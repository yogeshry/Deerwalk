package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CommentServiceSpec extends Specification {

    AwardService awardService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Comment(...).save(flush: true, failOnError: true)
        //new Comment(...).save(flush: true, failOnError: true)
        //Comment award = new Comment(...).save(flush: true, failOnError: true)
        //new Comment(...).save(flush: true, failOnError: true)
        //new Comment(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //award.id
    }

    void "test get"() {
        setupData()

        expect:
        awardService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Comment> awardList = awardService.list(max: 2, offset: 2)

        then:
        awardList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        awardService.count() == 5
    }

    void "test delete"() {
        Long awardId = setupData()

        expect:
        awardService.count() == 5

        when:
        awardService.delete(awardId)
        sessionFactory.currentSession.flush()

        then:
        awardService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Comment award = new Comment()
        awardService.save(award)

        then:
        award.id != null
    }
}
