import NavBar from "@/app/components/NavBar";
import HeroSection from "@/app/components/HeroSection";
import JobSection from "@/app/components/JobOffers/JobSection";

export default function Home() {
    return (
        <div className="w-full">
            <NavBar/>
            <HeroSection/>
            <JobSection/>
        </div>
    )
}