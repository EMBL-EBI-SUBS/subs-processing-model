import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.ac.ebi.subs.data.Submission;
import uk.ac.ebi.subs.data.component.Submitter;
import uk.ac.ebi.subs.data.component.Team;
import uk.ac.ebi.subs.processing.SubmissionEnvelope;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class SubmissionEnvelopeTest {

    @Test
    public void whenStreamingSubmissionEnvelopeElementsItCannotContainNullElement() {
        Submission submission = createSubmission();

        SubmissionEnvelope submissionEnvelope = new SubmissionEnvelope();
        submissionEnvelope.setSubmission(submission);

        assertThat(
                submissionEnvelope.allSubmissionItemsStream().count(),
                is(equalTo(0L)));
    }

    private Submission createSubmission() {
        Submission submission = new Submission();
        submission.setId(UUID.randomUUID().toString());

        Team team = Team.build("testTeam");
        submission.setTeam(team);

        Submitter submitter = Submitter.build("test@email.com", "James Bond");
        submission.setSubmitter(submitter);

        return submission;
    }
}
