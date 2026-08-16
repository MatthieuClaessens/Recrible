import NavBar from "@/app/components/NavBar";
import HeroSection from "@/app/components/HeroSection";
import JobOffers from "@/app/components/JobOffers";

export default function Home() {
    return (
        <div className="w-full">
            <NavBar/>
            <HeroSection/>
            <JobOffers/>
        </div>
    )
}