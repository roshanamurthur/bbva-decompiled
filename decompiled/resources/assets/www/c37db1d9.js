import{z as e,ar as t,a8 as a,a9 as r,b1 as i,a as o,an as n,aJ as c,L as s,ag as l,ak as d,h as g,aV as h,f as p,g as b,ac as v,ad as m,ab as y,bf as u,aa as f,af as x,bh as _,cm as k,cn as $,co as S,bc as w,cp as C,i as I}from"./952f98a9.js";var D=e`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new t).mediaRules()}`;const T=new t;var F=e`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
}
${T.mediaRules()}`;const L={dark:e`
    ${i.dark}
    ${F}
  `,light:e`
    ${i.light}
    ${D}
  `},R=new t;var E=e`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${a(r.secondary200)})));
  --skeleton-quote-bg: var(--bbva-date-dark-mode-skeleton-bg, var(--bbva-date-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((50px * 2) + (15px/ 2)) 15px;
  background-position: 0 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  white-space: nowrap;
}
${R.mediaRules()}`;class q extends(o(n(c(s)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":l}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,E,d("bbva-date-shared-styles"),L.light,L.dark]}updated(e){var t,a;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=t.day||t.month||t.year;return t.hour&&t.minute&&!a?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),a=new Date(e[1]),r={...this.options};return r.month="long",[t,a].map(((e,t)=>e.toLocaleDateString(this.locale,r).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&g` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||h}get _tplDateRange(){var e;return this.isValidRange&&(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&g`
          <bbva-text
            unset
            text="${this._fromToDateFormat(this.dateRange)}"
            font-weight="500"
            font-style="italic"
            size="S"
            aria-hidden="true"
          >
          </bbva-text>
          <span data-id="sr-only" class="sr-only"
            >${this._fromToDateFormatA11y(this.dateRange)}</span
          >
        `||h}render(){return g` ${this._tplDate} ${this._tplDateRange} `}}var z={...p,bbvaDate:`\n        --bbva-date-dark-mode-color: ${b("colors.primaryCoreLightened")};\n        --bbva-date-dark-mode-skeleton-quote-color: ${b("colors.cool50")};\n    `};const B=new t;var P=e`:host {
  position: relative;
  display: block;
  background: var(--_card-article-bg-color);
  box-sizing: border-box;
  border-radius: 1px;
  --_card-article-box-shadow: var(--bbva-card-article-box-shadow, var(--boxShadowType1, ${a(u.type1)}));
  --_card-article-title-container-color: var(--bbva-card-article-dark-mode-color, var(--bbva-card-article-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_card-article-title-container-color-expanded: var(--bbva-card-article-dark-mode-color-expanded, var(--bbva-card-article-color-expanded, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_card-article-header-img-height: var(--bbva-card-article-header-img-height, 9rem);
  --_card-article-bg-color-pressed: var(--bbva-card-article-dark-mode-bg-color-pressed, var(--bbva-card-article-bg-color-pressed, var(--colorsSecondary100, ${a(r.secondary100)})));
  --_card-article-title-color-pressed: var(--bbva-card-article-dark-mode-title-color-pressed, var(--bbva-card-article-title-color-pressed, var(--colorsPrimaryCore, ${a(r.primaryCore)})));
  --_card-article-missing-image-background-color: var(--bbva-card-article-dark-mode-missing-image-background-color, var(--bbva-card-article-missing-image-background-color, var(--colorsSecondary100, ${a(r.secondary100)})));
  --_card-article-missing-image-color: var(--bbva-card-article-dark-mode-missing-image-color, var(--bbva-card-article-missing-image-color, var(--colorsSecondary500, ${a(r.secondary500)})));
  --_card-article-image-height: var(--bbva-card-article-image-height, 9rem);
  --_card-article-image-width: var(--bbva-card-article-image-width, 100%);
  --_card-article-text-color: var(--bbva-card-article-dark-mode-text-color, var(--bbva-card-article-text-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_card-article-text-size: var(--bbva-card-article-text-size, var(--typographyType3XSmall, ${a(v.type3XSmall)}));
  --_card-article-text-line-height: var(--bbva-card-article-text-line-height, var(--lineHeightType3XSmall, ${a(m.type3XSmall)}));
  --_card-article-text-style: var(--bbva-card-article-text-style, var(--fontFacePrimaryBookFontStyle, ${a(y.book.fontStyle)}));
  --_card-article-text-weight: var(--bbva-card-article-text-weight, var(--fontFacePrimaryBookFontStyle, ${a(y.book.fontStyle)}));
  --_card-article-bg-color: var(--bbva-card-article-dark-mode-bg-color, var(--bbva-card-article-bg-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  box-shadow: var(--_card-article-box-shadow);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:active) {
  background: var(--_card-article-bg-color-pressed);
  --_card-article-title-container-color: var(--_card-article-title-color-pressed);
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

:host([hide-box-shadow]) {
  --bbva-card-article-box-shadow: none;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.header-img {
  width: 100%;
  height: var(--_card-article-header-img-height);
  object-fit: cover;
  object-position: var(--bbva-card-article-object-position, top center);
}

.content {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem);
}

.text {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) 0;
  font-size: var(--bbva-card-article-content-font-size, var(--typographyTypeSmall, ${a(v.typeSmall)}));
  font-weight: var(--bbva-card-article-content-font-weight, var(--fontFacePrimaryBookFontWeight, ${a(y.book.fontWeight)}));
  font-style: var(--bbva-card-article-content-font-style, var(--fontFacePrimaryBookFontStyle, ${a(y.book.fontStyle)}));
  line-height: var(--bbva-card-article-content-line-height, var(--lineHeightTypeSmall, ${a(m.typeSmall)}));
}

[data-tag-name=bbva-date] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem);
}

.missing-description {
  font-size: var(--_card-article-text-size);
  line-height: var(--_card-article-text-line-height);
  font-style: var(--_card-article-text-style);
  font-weight: var(_card-article-text-weight);
  color: var(--_card-article-text-color);
}

.title {
  color: var(--_card-article-title-container-color);
  font-size: var(--typographyTypeMedium, ${a(v.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(y.medium.fontWeight)});
}
:host([expanded]) .title {
  color: var(--_card-article-title-container-color-expanded);
}

.categories-container {
  display: flex;
  flex-wrap: wrap;
}
.categories-container [data-tag-name=bbva-badge-icon] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) 0 0;
}

.image-container {
  flex: none;
  position: relative;
  overflow: hidden;
  height: var(--_card-article_image-height);
  width: var(--_card-article-image-width);
}

.image {
  position: absolute;
  object-fit: cover;
  object-position: var(--bbva-card-article-object-position, center center);
  height: var(--_card-article-image-height);
  width: var(--_card-article-image-width);
}

.missing-image {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  justify-content: center;
  height: var(--_card-article-image-height);
  width: var(--_card-article-image-width);
  background-color: var(--_card-article-missing-image-background-color);
}

.missing-image .icon {
  color: var(--_card-article-missing-image-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem);
}

.description {
  display: block;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) 0 0;
  font-size: var(--typographyTypeSmall, ${a(v.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(m.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${a(y.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(y.book.fontStyle)});
}

:host([description-medium]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(y.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(y.medium.fontStyle)});
}

.tags {
  display: flex;
  padding: 0;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) 0 0;
  list-style: none;
}
.tags [data-tag-name=bbva-badge-default] {
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(f.spacer)}))) / 16) * 1rem) 0 0;
}

:host([layout=carousel]) .secondary-content {
  display: none;
}

:host([loading]):after {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  display: inline-block;
  height: 11.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--bbva-card-article-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(r.secondary200)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-card-article-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(r.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--bbva-card-article-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(r.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--bbva-card-article-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(r.secondary200)}))) 50%);
  background-color: var(--bbva-card-article-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, transparent));
  background-size: 100% 144px, calc((60% * 2) + (16px/ 2)) 16px, calc((85% * 2) + (16px/ 2)) 16px, calc((70% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 16px 160px, 16px 192px, 16px 216px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${B.mediaRules()}`;class V extends(n(o(s))){static get is(){return"bbva-card-article"}static get scopedElements(){return{"bbva-date":q,"bbva-core-icon":x,"bbva-badge-default":_,"bbva-badge-icon":k,"bbva-text":l}}static get properties(){return{badgeType:{type:String,attribute:"badge-type"},category:{type:String},secondaryCategory:{type:String,attribute:"secondary-category"},categoryIcon:{type:String,attribute:"category-icon"},secondaryCategoryIcon:{type:String,attribute:"secondary-category-icon"},categoryText:{type:String,attribute:"category-text",reflect:!0},secondaryCategoryText:{type:String,attribute:"secondary-category-text",reflect:!0},principalCategory:{type:String,attribute:"principal-category"},principalCategoryIcon:{type:String,attribute:"principal-category-icon"},principalCategoryText:{type:String,attribute:"principal-category-text"},date:{type:Date,converter:e=>new Date(e)},dateOptions:{type:Object},description:{type:String},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionEllipsisLines:{type:Number,attribute:"description-ellipsis-lines"},expanded:{type:Boolean,reflect:!0},image:{type:String},imageDefault:{type:String,attribute:"image-default"},loadingImgType:{type:String,attribute:"loading-img-type"},imageAccessibilityText:{type:String,attribute:"image-accesibility-text"},language:{type:String},fixed:{type:Boolean,reflect:!0},tags:{type:Array},title:{type:String},contentTitle:{type:String,attribute:"content-title"},titleEllipsisLines:{type:Number,attribute:"title-ellipsis-lines"},layout:{type:String},hideBoxShadow:{type:Boolean,attribute:"hide-box-shadow"},iconImage:{type:String,attribute:"icon-image"},iconImageOff:{type:String,attribute:"icon-image-off"},textImageOff:{type:String,attribute:"text-image-off"},_errorImage:{type:Boolean,attribute:"error-image"},withIcon:{type:Boolean,attribute:"with-icon"},enableInteractivity:{type:Boolean,attribute:"enable-interactivity"}}}constructor(){super(),this.expanded=!1,this.fixed=!1,this.descriptionEllipsisLines=2,this.hideBoxShadow=!1,this.descriptionMedium=!1,this.loadingImgType="eager",this.imageAccessibilityText="",this.addEventListener("click",this.toggle),this.iconImage=$(),this.iconImageOff=S(),this.textImageOff="bbva-card-article-text-imageoff",this._errorImage=!1,this.withIcon=!1,this.enableInteractivity=!1,this.categories=[]}update(e){super.update(e),e.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[P,w.light,L.light,C.light,d("bbva-card-article-shared-styles")]}toggle(){this.dispatchEvent(new CustomEvent("card-article-click",{detail:this.expanded,bubbles:!0,composed:!0})),this.fixed||"carousel"===this.layout||(this.expanded=!this.expanded,this.dispatchEvent(new CustomEvent("card-article-expand-click",{detail:this.expanded,bubbles:!0,composed:!0})))}_imageErrorLoading(e){if(this.imageDefault){e.target.src=this.imageDefault}else this._errorImage=!0}_renderMissingIcon(e,t){return g` <div class="missing-image">
      <bbva-core-icon class="icon" icon="${e}"></bbva-core-icon>
      ${t&&g`<bbva-text ?enable-interactivity="${this.enableInteractivity}" unset class="missing-description" .text="${this.t(t)}"></bbva-text>`}
    </div>`}get _image(){return this.image?g`
          <img
            loading="${this.loadingImgType}"
            class="header-img"
            src="${this.image}"
            alt="${this.imageAccessibilityText}"
            @error="${this._imageErrorLoading}"
          />
        `:this.withIcon?this._renderMissingIcon(this.iconImage,""):null}get _icon(){return this._renderMissingIcon(this.iconImageOff,this.textImageOff)}get _date(){return g`
      <bbva-date
        .date=${this.date}
        .language="${this.language}"
        options=${I(this.dateOptions)}
      ></bbva-date>
    `}get _description(){return g`
      <bbva-text
        ?enable-interactivity="${this.enableInteractivity}"
        class="description"
        .text=${this.description}
        .ellipsis=${!this.expanded}
        .lines=${this.expanded?0:this.descriptionEllipsisLines}
        unset
      ></bbva-text>
    `}get _tags(){return g`
      <ul class="tags">
        ${this.tags.map((e=>g`
            <li>
              <bbva-badge-default text="${e}" type="${I(this.badgeType)}">
              </bbva-badge-default>
            </li>
          `))}
      </ul>
    `}_composeCategoryConfig(e,t,a){return{icon:e,category:t,description:a}}get _composeCategories(){return[this._composeCategoryConfig(this.categoryIcon,this.category,this.categoryText),this._composeCategoryConfig(this.secondaryCategoryIcon,this.secondaryCategory,this.secondaryCategoryText)].reduce(this._reduceCategory,[])}get _composePrincipalCategory(){return[this._composeCategoryConfig(this.principalCategoryIcon,this.principalCategory,this.principalCategoryText)].reduce(this._reduceCategory,[])}_reduceCategory(e,t){const a=[...e];return(t.description||t.category)&&a.push(t),a}get _renderCategories(){return this._renderCategorySection(this._composeCategories)}get _renderPrincipalCategory(){return this._renderCategorySection(this._composePrincipalCategory)}_renderCategorySection(e){return e.length?g`
        <div class="categories-container">
          ${e.map((e=>g`
              <bbva-badge-icon
                ?enable-interactivity="${this.enableInteractivity}"
                .icon=${e.icon}
                .category=${e.category}
                .description=${e.description}
              >
              </bbva-badge-icon>
            `))}
        </div>
      `:h}_renderImage(){return g`<div class="image-container" aria-hidden="true" onclick="void(0)">
      ${this._errorImage?this._icon:this._image}
    </div>`}render(){return g`
      ${this._renderImage()}
      <div class="content" ambient="light" onclick="void(0)">
        ${this.date?this._date:h}
        <bbva-text
          ?enable-interactivity="${this.enableInteractivity}"
          class="title"
          text=${I(this.contentTitle)}
          .ellipsis=${this.titleEllipsisLines&&this.titleEllipsisLines>0}
          .lines=${this.titleEllipsisLines}
          unset
        ></bbva-text>
        ${this._renderPrincipalCategory}
        <div class="secondary-content" onclick="void(0)">
          <div class="text">
            <slot></slot>
          </div>
          ${this.description?this._description:h} ${this.tags?this._tags:h}
          ${this._renderCategories}
        </div>
      </div>
      <div class="skeleton"></div>
    `}}export{V as B,z as b};
