import{z as t,L as e,ak as a,h as s}from"./952f98a9.js";import"./7f3d7ca9.js";var r=t`:host {
  color: var(--cells-date-color, #003f8C);
  box-sizing: border-box;
  display: block;
  @apply --cells-text-size-l-mini;
  @apply --cells-date; }

:host([hidden]), [hidden] {
  display: none; }

time {
  display: inline-flex;
  flex-direction: column;
  text-align: center;
  @apply --cells-date-sticker-time; }

.day {
  font-size: var(--cells-date-sticker-day-font-size, 1.125rem);
  font-weight: 500;
  margin-bottom: 0.125rem;
  letter-spacing: 0.3px;
  @apply --cells-date-sticker-day; }

.month {
  font-size: var(--cells-date-sticker-month-font-size, 0.5625rem);
  text-transform: uppercase;
  text-decoration: none;
  margin-bottom: 0.125rem;
  @apply --cells-date-sticker-month; }

.year {
  font-size: var(--cells-date-sticker-year-font-size, 0.625rem);
  @apply --cells-date-sticker-year; }
`;const i=["sameDay","nextDay","nextWeek","lastDay","lastWeek","sameElse"];class o extends e{static get is(){return"cells-date"}static get properties(){return{date:{type:String},format:{type:String},locale:{type:String},utc:{type:Boolean},utcOffset:{type:Number,attribute:"utc-offset"},calendarTime:{type:Boolean,attribute:"calendar-time"},calendarFormats:{type:Object,attribute:"calendar-formats"},momentData:{type:Object,attribute:"moment-data"},sticker:{type:Boolean},showStickerYear:{type:Boolean,attribute:"show-sticker-year"}}}get _momentData(){const t=this.date,e=this.locale,a=moment(t);return a.locale(e),this._setUtcOffset(a),this._setUtc(a),a}_setUtcOffset(t){"number"==typeof this.utcOffset&&t.utcOffset(this.utcOffset)}_setUtc(t){this.utc&&t.utc()}get _hasCalendarFormat(){return this.calendarTime&&this.calendarFormats}get _formattedDate(){if(this._momentData&&this.format&&this._momentData.isValid())return this._hasCalendarFormat?this._getCalendarOrFormattedDate():this._getFormattedDate()}_getFormattedDate(){return this._momentData.format(this.format)}_getCalendarOrFormattedDate(){return this._momentData.calendar(null,this._getAllowedCalendarFormats())}_getAllowedCalendarFormats(){const t=this.calendarFormats[this.locale]||this.calendarFormats;return i.reduce(((e,a)=>(e[a]=t[a]||this.format,e)),{})}get stickerData(){const t=this._momentData||moment(),e=this.format,a=this.showStickerYear;return{dateTime:t.format(e),day:t.format("DD"),monthName:t.format("MMMM"),monthShort:t.format("MMM"),year:a?t.format("YYYY"):null}}constructor(){super(),this.date="",this.format="DD/MM/YYYY",this.locale=document.documentElement.lang||"en",this.utc=!1,this.utcOffset=null,this.calendarTime=!1,this.calendarFormats={en:{sameDay:"[Today]"},es:{sameDay:"[Hoy]"}},this.momentData={},this.sticker=!1,this.showStickerYear=!1}static get shadyStyles(){return`\n      ${r.cssText}\n      ${a("cells-date-shared-styles").cssText}\n      `}render(){return s`
    <style>${this.constructor.shadyStyles}</style>
    ${this.sticker?s`
        <time .datetime="${this.stickerData.dateTime}">
          <span class="day">${this.stickerData.day}</span>
          <abbr class="month" title="${this.stickerData.monthName}">${this.stickerData.monthShort}</abbr>
          ${this.showStickerYear?s`<span class="year">${this.stickerData.year}</span>`:""}
        </time>
      `:s`<span id="date">${this._formattedDate}</span>`}
    `}updated(t){t.forEach(((t,e)=>{if("momentData"===e)this.dispatchEvent(new CustomEvent("moment-data-changed",{composed:!0,bubbles:!0,detail:{value:this.momentData}}))}))}}customElements.define(o.is,o);
