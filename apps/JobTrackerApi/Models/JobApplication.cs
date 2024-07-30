namespace JobTrackerApi.Models
{
    public class JobApplication
    {
        public int Id { get; set; }
        public string? Company { get; set; }
        public string? Position { get; set; }
        public string? Status { get; set; }
        public DateTime AppliedDate { get; set; }
        public string? Notes { get; set; }
    }
}
